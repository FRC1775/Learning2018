package org.usfirst.frc.team1775.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1775.robot.Robot;
import org.usfirst.frc.team1775.robot.RobotMap;

public class Pressure extends Command {
	public double speed;
	public int counter;
	public Pressure() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.motorSubsystem);
	}
	protected void initalize() {
		counter = 0;
		speed = 0.5;
	}


	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if (!RobotMap.clickeySwitch.get()) {
		if (counter %5==0) {
			speed = RobotMap.motorController.get()+0.1;
		}
		RobotMap.motorController.set(speed);
		} else {
			RobotMap.motorController.set(0);
			speed = 0.5;
		}
		System.out.println("speed:" + speed);
		System.out.println("counter" + counter);
		
		/*if (!RobotMap.clickeySwitch.get()) {
			RobotMap.motorController.set(0.5);
		}else {
			RobotMap.motorController.set(0);
		}*/
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
