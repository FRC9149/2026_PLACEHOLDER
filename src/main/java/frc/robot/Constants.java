// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.robocats.swerve.ModuleConfig;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class DriveConstants {
    public static final int kFrontLeftDriveMotorPort = 1;
    public static final int kRearLeftDriveMotorPort = 3;
    public static final int kFrontRightDriveMotorPort = 5;
    public static final int kRearRightDriveMotorPort = 7;

    public static final int kFrontLeftTurningMotorPort = 2;
    public static final int kRearLeftTurningMotorPort = 4;
    public static final int kFrontRightTurningMotorPort = 6;
    public static final int kRearRightTurningMotorPort = 8;

    public static final int kFrontLeftEncoderPort = 14;
    public static final int kRearLeftEncoderPort = 17;
    public static final int kFrontRightEncoderPort = 16;
    public static final int kRearRightEncoderPort = 15;

    public static final double kFrontLeftAbsoluteEncoderOffset = 0.215576;
    public static final double kRearLeftAbsoluteEncoderOffset = 0.029785;
    public static final double kFrontRightAbsoluteEncoderOffset = 0.961426;
    public static final double kRearRightAbsoluteEncoderOffset = 0.221924;

    public static final ModuleConfig moduleConfiguration = new ModuleConfig(
      kFrontLeftDriveMotorPort,
      kRearLeftDriveMotorPort,
      kFrontRightDriveMotorPort,
      kRearRightDriveMotorPort,
      kFrontLeftTurningMotorPort,
      kRearLeftTurningMotorPort,
      kFrontRightTurningMotorPort,
      kRearRightTurningMotorPort,
      kFrontLeftEncoderPort,
      kRearLeftEncoderPort,
      kFrontRightEncoderPort,
      kRearRightEncoderPort,
      kFrontLeftAbsoluteEncoderOffset,
      kRearLeftAbsoluteEncoderOffset,
      kFrontRightAbsoluteEncoderOffset,
      kRearRightAbsoluteEncoderOffset,
      false, true, true, false);

    // If you call DriveSubsystem.drive() with a different period make sure to update this.
    public static final double kDrivePeriod = TimedRobot.kDefaultPeriod;

    public static final double kTrackWidth = 0.56515;
    // Distance between centers of right and left wheels on robot
    public static final double kWheelBase = 0.56515 ;
    // Distance between front and back wheels on robot

    public static final SwerveDriveKinematics kDriveKinematics =
        new SwerveDriveKinematics(
            new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
            new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(kWheelBase / 2, kTrackWidth / 2));
  }
}
