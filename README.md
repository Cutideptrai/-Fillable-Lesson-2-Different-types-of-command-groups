# -Fillable-Lesson-2-Different-types-of-command-groups
The aim of this lesson is for programming members to recall what they learned in the "Commanding a motor to spin" lesson, and apply it with the new knowledge they have learned about command groups. 

TO DO:
    RobotContainer: Configure bindings
    Constants: Change motor ID's to correct ones
    Do both SequentialCommand & ParallelCommand:
        SequentialCommand - Run the shooter then stop, then run the algae remover and stop it. runtime of your choosing
        ParallelCommand - run both the shooter and algae remover at the same time, then stop them both. runtime of your choosing
    If you feel like it, do EITHER deadline or race:
        DeadlineCommand - Run like the parallel command instructions, but make sure the first command listed is shorter.
        RaceCommand - same as ParallelDeadlineCommand

GIVEN COMMANDS: 
    AlgaeBackwards - runs algae remover backwards, with timeout of your own chosen length.
    AlgaeForwards - runs algae remover forwards, with timeout of your own chosen length.
    AlgaeStop - stops the algae remover, no timeout
    ShooterBackwards - runs the shooter backwards, with timeout of your own chosen length.
    ShooterForwards - runs the shooter forwards, with timeout of your own chosen length.
    ShooterStop - stops the shooter, no timeout