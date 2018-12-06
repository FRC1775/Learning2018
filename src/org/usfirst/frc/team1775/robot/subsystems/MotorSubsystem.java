package org.usfirst.frc.team1775.robot.subsystems;

import org.usfirst.frc.team1775.robot.RobotMap;
import org.usfirst.frc.team1775.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSubsystem extends Subsystem {
	// Put methods for controlling this subsystem here. 
	// Call these methods from Commands.
    
    @Override
    protected void initDefaultCommand() {
    	setDefaultCommand(new  Pressure());
		// Set the default command for a subsystem here. 
    	// This command runs whenever any other command isn't running.
        // setDefaultCommand(new Command()); - Should create a new Command class
    	setDefaultCommand(new Drive());
    }
    
    public static void driveMotor(double speed) {
    	if (RobotMap.switchSensor.get() == false) {
    		RobotMap.motorController.setSpeed(0);
		}
		else RobotMap.motorController.setSpeed(speed);
    	
    
}