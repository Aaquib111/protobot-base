/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.Drive;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final DriveTrain driveTrain;
  public Joystick gamepad; 


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    driveTrain = new DriveTrain();
    gamepad = new Joystick(Constants.GAMEPAD);
    //private final Command drive = new Drive(driveTrain,  gamepad.getY(Constants.GAMEPAD_LEFT), gamepad.getY(Constants.GAMEPAD_RIGHT));
    // Configure the button bindings
    configureButtonBindings();

    driveTrain.setDefaultCommand(new Drive(driveTrain));
  }

  private void configureButtonBindings() {
  }

  public double getLeftAxis(){
    return gamepad.getRawAxis(Constants.GAMEPAD_LEFT);
  }

  public double getRightAxis(){
    return gamepad.getRawAxis(Constants.GAMEPAD_RIGHT);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
