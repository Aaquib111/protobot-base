/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  //Left speedcontrollers
  private final SpeedControllerGroup left =
    new SpeedControllerGroup(new Spark(Constants.TOP_LEFT), new Spark(Constants.BOTTOM_LEFT));
  

  //Right speedcontrollers
  private final SpeedControllerGroup right =
    new SpeedControllerGroup(new Spark(Constants.TOP_RIGHT), new Spark(Constants.BOTTOM_RIGHT));
    
    
  public DriveTrain() {

  }

  private final DifferentialDrive drive = new DifferentialDrive(left, right);

  public void tankDrive(double left, double right){
    drive.tankDrive(left, right);
  }
  /**
   * Will be called periodically whenever the CommandScheduler runs.
   */
  @Override
  public void periodic() {

  }
}
