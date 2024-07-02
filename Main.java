import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
    Election election= new Election();
    Scanner sc= new Scanner(System.in); 
     
    while(true)
    {
        System.out.println("\n Election System menu ");
        System.out.println("1. add candidate ");
        System.out.println("2. cast vote");
        System.out.println("3. Display votes");
        System.out.println("4. Declare Winner");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");

        int choice=sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
            System.out.println("Enter candidate name:");
            String CandidateName=sc.nextLine();
            election.addCandidate(CandidateName);
                break;
            case 2:
              System.out.println("Candidate names:-");
             // System.out.println("");
               election.showAllCandidates();
               System.out.println("Enter candidate name to vote for :");
                String voteCandidateName=sc.nextLine();
                election.castVoter(voteCandidateName);
                break;
            case 3:
                election.displayVotes();

                break;
             case 4:
                election.declareWinner();
                break;
            case 5:
            System.out.println("Exiting the election System");
            sc.close();
            System.exit(0);
                
                break;
            default:
            System.out.println("invalid choice please try again");
                break;
        }
        //sc.close();
    }
}
}