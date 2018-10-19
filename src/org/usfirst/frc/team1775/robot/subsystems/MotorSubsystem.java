package org.usfirst.frc.team1775.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSubsystem extends Subsystem {
	// Put methods for controlling this subsystem here. 
	// Call these methods from Commands.
    
    @Override
    protected void initDefaultCommand() {
		// Set the default command for a subsystem here. 
    	// This command runs whenever any other command isn't running.
        // setDefaultCommand(new Command()); - Should create a new Command class
    }
    
    public void driveMotor(double speed) {
        // Set the speed of RobotMap.motorController
    }
}