package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class ShooterStop extends SequentialCommandGroup
{
    public ShooterStop ()
    {
        addCommands(
            Constants.SHOOTER_SUBSYSTEM.stopCommand()
            );
        
        addRequirements(Constants.SHOOTER_SUBSYSTEM);
    }
}