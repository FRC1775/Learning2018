package org.usfirst.frc.team1775.robot.commands;

import org.usfirst.frc.team1775.robot.OI;
import org.usfirst.frc.team1775.robot.Robot;
import org.usfirst.frc.team1775.robot.RobotMap;
import org.usfirst.frc.team1775.robot.subsystems.MotorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	double previous;
	public Drive(){
		requires(Robot.motorSubsystem);
	}
	@Override
	protected void initialize() {
		previous=0;
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if (!RobotMap.switchSensor.get()) {
			RobotMap.motorController.setSpeed(previous);
			previous=previous+.001;
		} else {
			RobotMap.motorController.setSpeed(0);
			previous=0;
		}
	}
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}