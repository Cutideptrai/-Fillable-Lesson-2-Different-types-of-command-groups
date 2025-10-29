package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class AlgaeStop extends SequentialCommandGroup
{
    public AlgaeStop ()
    {
        addCommands(
            Constants.ALGAE_REMOVER_SUBSYSTEM.stopRemoverCommand()
            );
        
        addRequirements(Constants.ALGAE_REMOVER_SUBSYSTEM);
    }
}