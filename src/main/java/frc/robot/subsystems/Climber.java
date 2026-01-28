package frc.robot.subsystems;

import java.util.HashMap;

import static com.robocats.YallKnowWhatThisIs.THE_NULL.NULL;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  private final SparkMax Climbm1 = new SparkMax(1, MotorType.kBrushless);
  private final SparkMax Climbm2 = new SparkMax(2, MotorType.kBrushless);

  private final RelativeEncoder e1 = Climbm1.getEncoder();
  private final RelativeEncoder e2 = Climbm1.getEncoder();

  private final double MAX_HEIGHT = NULL;
  private final double MIN_HEIGHT = 0;
  private final double HOLD_SPEED = 0;

  private final HashMap<Integer, Double> climbHeights = new HashMap<>();

  private final double encoderTolerance = 0;

  private final SparkMaxConfig config = new SparkMaxConfig();

  public Climber(boolean inverted) {
    config
        .inverted(inverted)
        .idleMode(IdleMode.kBrake);

    Climbm1.configure(config, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
    Climbm2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);

    zeroEncoders();
    initHeights();
    
  }

  private void initHeights() {
    climbHeights.put(0, 0.0);
    climbHeights.put(1, 0.0);
    climbHeights.put(2, 0.0);
  }

  public void moveToHeight(double targetHeight, boolean hold) {
    double error = targetHeight - getHeight();
    double holdSpeed = hold ? HOLD_SPEED : 0;

    setSpeed(
        Math.abs(error) > encoderTolerance
            ? (error > 0 ? 0.6 : -0.4)
            : holdSpeed);
  }

    public void setSpeed(double speed) {
        if (!withinLimits(speed)) {
        stop();
        return;
    }
        Climbm1.set(speed);
        Climbm2.set(speed);

  }

  public void stop() {
    Climbm1.set(0);
    Climbm2.set(0);

  }

  public void hold() {
    Climbm1.set(HOLD_SPEED);
    Climbm2.set(HOLD_SPEED);
  }

  public void zeroEncoders() {
    e1.setPosition(0);
    e2.setPosition(0);
  }

  private boolean withinLimits(double speed) {
    double height = getHeight();

    if (height >= MAX_HEIGHT && speed > 0)
      return false;
    if (height <= MIN_HEIGHT && speed < 0)
      return false;

    return true;
  }

  public double getHeight() {
    return (Math.abs(e1.getPosition()) + Math.abs(e2.getPosition())) / 2;
  }

  public boolean atHeight(int level) {
    return Math.abs(getHeight() - climbHeights.get(level)) <= encoderTolerance;
  }

  public boolean atMaxHeight() {
    return getHeight() >= MAX_HEIGHT;
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Climber Encoders", getHeight());
    SmartDashboard.putNumber("Climber one", e1.getPosition());
    SmartDashboard.putNumber("Climber two", e2.getPosition());
  }
}