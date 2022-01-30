# Design Notes
GameRunner
- Flow:
  - Creates game
  - Adds 3 players
  - Creates a random seed
  - in a loop until winner found
    - Calls game.roll(1-6) then
    - Calls game.wrongAnswer(1 out of 9 times)
      - or
    - Calls game.wasCorrectlyAnswered (8 out of 9 times)
## Design issues
- Uses global var for notAWinner
## Testing issues
- Use of Random hinders reproducable behavior
- Approval tests w/ specific random seeds would be helpful but not necessarily full-coverage