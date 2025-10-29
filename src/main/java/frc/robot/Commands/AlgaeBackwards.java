package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import java.lang.Math;

public class AlgaeBackwards extends SequentialCommandGroup
{
    public AlgaeBackwards ()
    {
        addCommands(
            Constants.ALGAE_REMOVER_SUBSYSTEM.runRemoverBackwardsCommand(),
            new WaitCommand(Math.random() * 5) // random time between 0s and 5s
            );
        
        addRequirements(Constants.ALGAE_REMOVER_SUBSYSTEM);
    }
}