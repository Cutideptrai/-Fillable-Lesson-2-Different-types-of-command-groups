package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import java.lang.Math;

public class ShooterBackwards extends SequentialCommandGroup
{
    public ShooterBackwards ()
    {
        addCommands(
            Constants.SHOOTER_SUBSYSTEM.runMotorBackwardsCommand(),
            new WaitCommand(Math.random() * 5) // random time between 0s and 5s
            );
        
        addRequirements(Constants.SHOOTER_SUBSYSTEM);
    }
}