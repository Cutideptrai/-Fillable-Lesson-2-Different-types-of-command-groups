package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class RaceCommand extends SequentialCommand
{
    /*
     * Run both the shooter and the remover
     * set one of them to be shorter than the other
     * stop both after race group
     */
    public RaceCommand ()
    {
        addCommands(
            new ParallelRaceGroup(
                new WaitCommand(0), // temp
                new ShooterForwards(4),
                new AlgaeForwards(2)
            ),
            new ShooterStop(),
            new AlgaeStop()
        );

        addRequirements(getRequirements());
    }
}
