package org.usfirst.frc.team1775.robot.commands;

import org.usfirst.frc.team1775.robot.OI;
import org.usfirst.frc.team1775.robot.Robot;
import org.usfirst.frc.team1775.robot.RobotMap;
import org.usfirst.frc.team1775.robot.subsystems.MotorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	public int previous;
	public int counter;
	public int current;
	public Drive(){
		requires(Robot.motorSubsystem);
	}
	@Override
	protected void initialize() {
	counter=1;	
	
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		current=-1;
		if(RobotMap.switchSensor.get()) {
			current=1;
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}