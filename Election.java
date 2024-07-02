import java.util.HashMap;
import java.util.Map;

class Election {
    // we are using map to store candidate with votes
    private Map<String, Integer> candidates;

    public Election() {

        candidates = new HashMap<>();
    }

    // add new candidate to the election
    public void addCandidate(String name) {
        name = name.toLowerCase();
        if (!candidates.containsKey(name))// if candidate is not existing
        {
            candidates.put(name, 0);
            System.out.println("Candidate " + name + "added successfully");
        } else {
            System.out.println("candidate " + name + "already exists");
        }
    }

    // alow voter to cast their voter for a candidate
    public void castVoter(String name) {
        name = name.toLowerCase();
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
            System.out.println("vote cast for " + name);
        } else {
            System.out.println("candidate " + name + " does not exist");
        }
    }
    // display total votes received by each candidate

    public void displayVotes() {
        System.out.println("Votes received  by each candidate:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " votes");
        }
    }

    public void showAllCandidates() {
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

    // declare the winner of the election
    public void declareWinner() {
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        if (winner != null) {
            System.out.println("the winner of the election is " + winner + " with  " + maxVotes + " votes. ");
        } else {
            System.out.println("no vote casted in the election. ");
        }
    }

}