package frc.robot.subsystems;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Release extends SubsystemBase{

    private final Servo s1release = new Servo(1);
    private final Servo s2release = new Servo(1);

    private int MIN_ANGLE = 0;
     private int MAX_ANGLE = 0;



    public void SetActuators(double position) {

        position = MathUtil.clamp(position, MIN_ANGLE, MAX_ANGLE);

        s1release.setAngle(position);

        s2release.setAngle(position);






    }






}
