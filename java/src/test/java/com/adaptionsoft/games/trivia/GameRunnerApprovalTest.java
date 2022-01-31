package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;

@UseReporter(DiffReporter.class)
@DisplayName("GameRunner Approval Tests")
public class GameRunnerApprovalTest {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class A_gameRunner_provides_consistent_output {
        @Test
        public void if_random_seed_is_0() throws Exception {
            ByteArrayOutputStream buffer = new ApprovalUtilities().writeSystemOutToStringBuffer();
            GameRunner.runGameWithSeed(0);
            String output = buffer.toString();
            Approvals.verify(output);
        }
    }
}
