package frc.robot.subsystems;

import java.util.HashMap;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase{
  
    private final SparkMax Climbm1 = new SparkMax(1, MotorType.kBrushless);
    private final SparkMax Climbm2 = new SparkMax(2, MotorType.kBrushless);

    private final RelativeEncoder e1 = Climbm1.getEncoder();
    private final RelativeEncoder e2 = Climbm1.getEncoder();

    private final double MAX_HEIGHT = 0;
    private final double MIN_HEIGHT = 0;
    private final double HOLD_SPEED = 0;


    public void setSpeed(double speed) {
        Climbm1.set(speed);
        Climbm2.set(speed);

    }

    public void stop() {
        Climbm1.set(0);
        Climbm2.set(0);

    }
}