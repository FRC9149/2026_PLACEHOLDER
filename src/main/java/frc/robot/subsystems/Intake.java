/*
notes:

This currently does not have 
a purpose, but is set up for further coding




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

public class Intake extends SubsystemBase{
  
    private final SparkMax m1 = new SparkMax(1, MotorType.kBrushless);




//--------------------------------------------------------------------------------------------------------------

//public Intake 


  //-----------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------
 

//--------------------------------------------------------------------------------------

  


//-----------------------------------------------------------------------------------------------------------


  public void setSpeed(double speed) {
   m1.set(speed);
 
  }



//----------------------------------------------------------------------------------------------------------------



  @Override
  public void periodic() {
    //SmartDashboard.putNumber("Intake Encoders", m1.getEncoder());
    //SmartDashboard.putNumber("encoder one", e1.getPosition());
    
  }

//-----------------------------------------------------------------------------------------------

}

//============================================================================================================
