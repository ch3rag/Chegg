#include <iostream>
#include <cstring>
#define MAX 14
using namespace std;

class Team {
    public:
        Team();
        void SetTeamName(char s[]);
        void PlayGame(int TeamGoals, int OpponentGoals);
        void Print() const;
    private:
        int TeamPoints() const;
        char TeamName[50];
        int wins, draws, lossess;
};

void Team :: Print() const {
    cout << TeamName << " " << TeamPoints() << endl;
}

// New Code Starts
// Team() Constructor
// Initializes All Integer Class Data To Zero
Team :: Team() {
    wins = 0;
    draws = 0;
    lossess = 0;    
}

// SetTeamName()
// Setter For Team Name
void Team :: SetTeamName(char s[]) {
    strcpy(TeamName, s);
}

// PlayGame() Method
// Alters Number Of Wins, Draws, Losses Based On The Goals
void Team :: PlayGame(int TeamGoals, int OpponentGoals) {
    if (TeamGoals > OpponentGoals) {
        wins++;
    } else if (TeamGoals == OpponentGoals) {
        draws++;
    } else {
        lossess++;
    }
}

// TeamPoints() Method
// Returns Total Number Of TeamPoints Based On The Number
// Of Wins, Draws And Losses
int Team :: TeamPoints() const {
    return wins * 3 + draws;
}


// Main
int main() {
    // Declare An Array Of Team Called CyprusLeague With 14 Positions
    Team CyprusLeague[MAX];
    // To Hold Team Name
    char teamName[50];
    // Input Team Names
    for (int i = 0; i < MAX; i++) {
        // Prompt
        cout << "Enter Team[" << i << "] Name: ";
        // Input
        fgets(teamName, 50, stdin);
        // Remove New Line
        teamName[strcspn(teamName, "\n")] = 0;
        // Update The Team Name In Array
        CyprusLeague[i].SetTeamName(teamName);
    }

    // Team At Position Played A Game With Team With Position 10
    // Team[2 ] Score = 3
    // Team[10] Score = 2
    CyprusLeague[2 ].PlayGame(3, 2);
    CyprusLeague[10].PlayGame(2, 3);

    // Display Name And Total Points For Each Team
    for (int i = 0; i < MAX; i++) {
        CyprusLeague[i].Print();
    }
    return 0;
}

