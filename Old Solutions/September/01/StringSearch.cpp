#include <iostream>
#include <cstring>
using namespace std;

// Returns The Index Of Word In The Statment
// Returns -1 If The Word Does Not Exist In The Statment
int search(const char statement[], const char word[]) {
    // Loop Through The Sentence From Index 0 To (Length Of Statement - Length Of Word)
    for (int i = 0; i <= strlen(statement) - strlen(word); i++) {
        // Flag Indicating If Word is Found
        bool flag = true;
        // Search For Word At Ith Index In The Sentence
        for (int j = 0; j < strlen(word); j++) {
            if (statement[i + j] != word[j]) {
                flag = false;
            }
        }

        // If Word Is Found Return I
        if (flag) {
            return i;
        }
    }

    // Return -1
    return -1;
}


int main(void) {
    // Test Code
    cout << "search(\"it is a very long trip\", \"very\"): " << search("it is a very long trip", "very") << endl;
    cout << "search(\"this grilled swordfish is marinated in lemon\", \"sword\"): " << search("this grilled swordfish is marinated in lemon", "sword") << endl;
    cout << "search(\"c plus plus is an easy programming language\", \"process\"): " << search("c plus plus is an easy programming language", "process") << endl;
}