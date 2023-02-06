class Program {

    // List To Hold String Combinations
    static List<string> words = new List<string>();
    // Max Length Of Strings
    const int MAX = 5;

    // Makes Word Recursively
    static void makeWords(int length, string word) {
        if (length > MAX) {
            return;
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            string newWord = word + ch;
            words.Add(newWord);
            makeWords(length + 1, newWord);
        }
    }

    // Main
    static void Main() {
        // Populate Words
        makeWords(1, "");
        // Password Strings To Crack
        string pw1 = "1c75d402fb481523acd44e9d8247bc80";
        string pw2 = "5b1d59b5451c06afb65ab1bc2713cfb4";

        // Create An Object Of PasswordHash
        PasswordHash ph = new PasswordHash();
            
        // Crack PW-1
        foreach (String word in words) {
            if (ph.hashPW(word) == pw1) {
                Console.WriteLine("Found Password 1: {0}", word);
                break;
            }
        }
        
        // Crack PW-2
        foreach (String word in words) {
            if (ph.hashPW(word) == pw2) {
                Console.WriteLine("Found Password 2: {0}", word);
                break;
            }
        }
    }
}