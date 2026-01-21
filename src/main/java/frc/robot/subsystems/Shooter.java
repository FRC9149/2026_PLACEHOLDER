/*
notes:

2. This is NOT usable yet

3. This is currently just frankensteined together as a skeleton for future code

4. YES THIS IS JUST A COPY PASTE FROM INTAKE


*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

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

public class Shooter extends SubsystemBase{
  //private SparkMax m1, m2;
  //private RelativeEncoder e1, e2;
  private PIDController pid = new PIDController(1, 0, 0);
  private SparkMaxConfig firstConfig = new SparkMaxConfig(), secondConfig = new SparkMaxConfig();
  private double encoderTolerance;


//--------------------------------------------------------------------------------------------------------------


  private void initMotors(boolean inverted1, boolean inverted2) {
    //m1 = new SparkMax(1, MotorType.kBrushless);
    //m2 = new SparkMax(20, MotorType.kBrushless);

    //e1 = m1.getEncoder();
    //e2 = m2.getEncoder();


    /*
    firstConfig
      .inverted(inverted1)
      .idleMode(IdleMode.kBrake)
    ;
    secondConfig
      .inverted(inverted2)
      .idleMode(IdleMode.kBrake)
    ;
*/
    //m1.configure(firstConfig, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
    //m2.configure(secondConfig, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
  }

  //-----------------------------------------------------------------------------------------

  public void setPID(double p, double i, double d) {
    pid = new PIDController(p, i, d);
  }

//----------------------------------------------------------------------------------------
  public void setPID(PIDController pid) {
    this.pid = pid;
  }

//--------------------------------------------------------------------------------------

  public void setEncoderTolerance(double tolerance) {
    this.encoderTolerance = tolerance;
  }


//-----------------------------------------------------------------------------------------------------------


  public void setSpeed(double speed) {
   // m1.set(speed);
   // m2.set(speed);
  }



//----------------------------------------------------------------------------------------------------------------



  @Override
  public void periodic() {
    //SmartDashboard.putNumber("elevator Encoders", getAverageEncoder()); Don't think I'll need this
    //SmartDashboard.putNumber("encoder one", e1.getPosition());
    //SmartDashboard.putNumber("encoder two", e2.getPosition());
  }

//-----------------------------------------------------------------------------------------------

}

//============================================================================================================
