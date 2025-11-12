package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class SequentialCommand extends SequentialCommandGroup
{
    public SequentialCommand ()
    {
        addCommands(
            new WaitCommand(0), // temp
            new ShooterForwards(5),
            new ShooterStop(),
            new AlgaeForwards(5),
            new AlgaeStop()
        );

        addRequirements(getRequirements());
    }
}
