/*
notes:

This currently does not have 
a purpose, but is set up for further coding




*/

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

public class Intake extends SubsystemBase{
  
    private final SparkMax m1 = new SparkMax(1, MotorType.kBrushless);

    private static final double INTAKE_SPEED = 0.75;
    private static final double OUTTAKE_SPEED = -0.75;

    public void intake() {
        m1.set(INTAKE_SPEED);
    }

    public void outtake() {
        m1.set(OUTTAKE_SPEED);
    }

    public void stop() {
        m1.stopMotor();
    }

//----------------------------------------------------------------------------------------------------------------



  
//-----------------------------------------------------------------------------------------------

}

//============================================================================================================
