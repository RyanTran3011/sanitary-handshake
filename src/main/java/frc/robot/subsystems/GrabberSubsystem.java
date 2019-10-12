/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

import frc.robot.RobotMap;
/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class GrabberSubsystem extends Subsystem {
  // Put methods for controlli ng this subsystem
  // here. Call these from Commands.

  DoubleSolenoid grabber = new DoubleSolenoid(RobotMap.FIRST_PCM_ID,RobotMap.GRABBER_FORWARD,RobotMap.GRABBER_BACKWARD);//placeholders

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    //setDefaultCommand(new Drive());
    grabber.set(DoubleSolenoid.Value.kReverse);
  }

  public void Open(){
    grabber.set(DoubleSolenoid.Value.kForward);
  }

  public void Close(){
    grabber.set(DoubleSolenoid.Value.kReverse);
  }

  public void Stop(){
    grabber.set(DoubleSolenoid.Value.kOff);
  }
}
