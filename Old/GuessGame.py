# Our Secret Word
secret = 'python'

# Input Guess From The User
guess = input(f'What is your {len(secret)}-letter guess? ')

# Check If Guess Has Valid Length
if (len(guess) == len(secret)):
    # Loop Through Each Character In The Guess
    for i in range(len(secret)):
        # Get The Guess Word Character
        chSecret = secret[i]
        # Get The Secret Word Character
        chGuess = guess[i]

        # Your Answer Starts Now
        # Find The Location In Your Program Where Current Index
        # The Guess Does Not Match Same Index Of The Secret
        if chSecret != chGuess:
            # Boolean Variable To Keep Track Whether The Guessed
            # Character Exists Anywhere Else In The Secret Word
            # Initialize It To False
            existElseware = False
            
            # Declare A Variable To Keep Track Of Alterative Index
            # Of The Secret Where The Character Exists
            altIndex = 0

            # While Exist Elsewhere Is Not True And AltIndex Is Less Than
            # Less Than Length Of The Secret
            while not existElseware and altIndex < len(secret):
                # Get The Character At Alternate Index
                chAlt = secret[altIndex]
                # Check If Character At Alternative Index And Current Character
                # Of The Guessed Word Match
                if chAlt == chGuess:
                    # Set Exists Elsewhere To True
                    existElseware = True
                # Increment Alternative Index
                altIndex += 1
            
            # If Exists Elsewher is Set, Print Blue Color Box
            if existElseware:
                print('🟦', end = '')
            else:
                # Else Print Black Color Box
                print('⬛', end = '')
        else:
            # They Matched!
            # Instead Of Pink I'm Printing Green
            print('🟩', end = '')

    # Print Result Of The Game
    if guess == secret:
        print('\nWoo! you got it!')
    else:
        print('\nNot quite. Play again soon!')
else:
    # Print A Error Message
    print('A guess must have 6-letters.')