use strict;
use warnings;

# Program Description
# Author:
# Date:
# Version: 

##########################################################
# Program Argument Error(s) Checking

# Number Of Arguments
my $numArgs = $#ARGV + 1;

# Check The Count Of Arguments
if ($numArgs != 2) {
    print "Error: MeyerEdward02.pl Expecs Exactly 2 Integer Program Arguments.\n";
    print "Usage: perl MeyerEdward02.pl INT1 INT2\n";
    exit;
}

# Check If First Argument Is Greater Than 0
if ($ARGV[0] <= 0) {
    print "Error: First Integer Argument $ARGV[0] is Not Greater Than 0.\n";
    exit;
}

# Check If The First Integer Is Less Than The Second Integer
if ($ARGV[0] >= $ARGV[1]) {
    print "Error: First Integer Argument $ARGV[0] is Not Less Than The Second Integer Argument $ARGV[1].\n";
    exit;
}

##########################################################

# Call SubRoutines Here

print "Counting From $ARGV[0] To $ARGV[1] is: ";
&countFirstToSecond($ARGV[0], $ARGV[1]);
print "\n";
my $summationResult = &sumFirstToSecond($ARGV[0], $ARGV[1]);
print "The Summation From $ARGV[0] to $ARGV[1] is: $summationResult\n";
my $spamMusubiOutput = &spamMusubiFirstToSecond($ARGV[0], $ARGV[1]);
print "The SpamMusubi from $ARGV[0] to $ARGV[1] is: \n";
print $spamMusubiOutput;
print "\nProgram Done.\n";

##########################################################

# Define SubRoutines Here

# Count From First Number To Second Number
sub countFirstToSecond {
    # Get First And Second Int
    my $firstInt = $_[0];
    my $secondInt = $_[1];
    # Loop From First To Second
    for my $i ($firstInt..$secondInt) {
        print "$i ";
    }
}

# Sum Numbers From First Number To Second Number
sub sumFirstToSecond {
    # Get First And Second Int
    my $firstInt = $_[0];
    my $secondInt = $_[1];
    # Declare Sum
    my $summation = 0;

    # Loop From First To Second
    for my $i ($firstInt..$secondInt) {
        # Add Current Number To Sum
        $summation = $summation + $i;
    }
    return $summation;
}

# Creats SpamMusubi String From First Integer To Second Integer
sub spamMusubiFirstToSecond {
    # Get First And Second Int
    my $firstInt = $_[0];
    my $secondInt = $_[1];
    # Output String
    my $output = ""; 

    # Loop From First To Second
    for my $i ($firstInt..$secondInt) {
        # If Current Number Divisible By Both 7 And 3
        if ($i % 3 == 0 && $i % 7 == 0) {
            $output = $output . "SpamMusubi ";
        # If Current Number Divisible By 3
        } elsif ($i % 3 == 0) {
            $output = $output . "Spam ";
        # If Current Number Divisible By 7
        } elsif ($i % 7 == 0) {
            $output = $output . "Musubi ";
        # If Current Number Divisible By Neither 3 Nor 7
        } else {
            $output = $output . $i . " ";
        }
    }
    return $output;
}