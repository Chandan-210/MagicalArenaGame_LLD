package arena;

public class ArenaSimulationResult {
    private final boolean isMatchInProgress;

    public ArenaSimulationResult(boolean isMatchInProgress){
        this.isMatchInProgress = isMatchInProgress;
    }

    public boolean isMatchInProgress() {
        return isMatchInProgress;
    }
}
