package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import java.lang.Math;

public class ShooterForwards extends SequentialCommandGroup
{
    public ShooterForwards ()
    {
        addCommands(
            Constants.SHOOTER_SUBSYSTEM.runMotorForwardsCommand(),
            new WaitCommand(Math.random() * 5) // random time between 0s and 5s
            );
        
        addRequirements(Constants.SHOOTER_SUBSYSTEM);
    }
}
