package frc.robot.subsystems;


import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Aiming extends SubsystemBase{

    private final Servo s1OnAiming = new Servo(0);
    private final Servo s2OnAiming = new Servo(0);

    public void setHeight(double height){
    height = MathUtil.clamp(height, 0, 180);
    s1OnAiming.setAngle(height);
    s2OnAiming.setAngle(height);


    }




    

}
