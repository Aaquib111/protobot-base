/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class Drive extends CommandBase {
  private final DriveTrain driveTrain;
  private double leftSpeed;
  private double rightSpeed;
  private RobotContainer m_robotContainer;

  public Drive(DriveTrain d) {
    driveTrain = d;
    addRequirements(driveTrain);
  }


  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    leftSpeed = m_robotContainer.getLeftAxis();
    rightSpeed = m_robotContainer.getRightAxis();
    driveTrain.tankDrive(leftSpeed, rightSpeed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  public void end(){
    driveTrain.tankDrive(0, 0);
  }
}
