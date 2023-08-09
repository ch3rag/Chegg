#include <stdio.h>

// Returns Total
double getTotal(int hours, double firstRate, double firstRateHours, double secondRate) {
    if (hours > firstRateHours) {
        return firstRateHours * firstRate + (hours - firstRateHours) * secondRate;
    } else {
        return firstRate * firstRateHours;
    }
}
int main() {
    // Type Of Vehicle
    char vehicleType;
    // Hours And Minutes Entered In The Parking Lot
    int inHour, inMinutes;
    // Hours And Minutes Exit The Parking Lot
    int outHour, outMinutes;

    // Input Parking Information
    // Type Of Vehicle
    printf("Type Of Vehicle?                                 ");
    scanf("%c", &vehicleType) ;
    while(vehicleType != '\n' && getchar() != '\n');

    // Entry Time
    printf("Hour's Vehicle Entered The Lot (0 - 24)?         ");
    scanf("%d", &inHour);
    printf("Minutes Vehicle Entered The Lot (0 - 24)?        ");
    scanf("%d", &inMinutes);
    // Exit Time
    printf("Hour's Vehicle Left The Lot (0 - 24)?            ");
    scanf("%d", &outHour);
    printf("Minutes Vehicle Left The Lot (0 - 24)?           ");
    scanf("%d", &outMinutes);

    // Calculation
    if (inHour < outHour || (inHour == outHour && (outMinutes - inMinutes) >= 0)) {
        // Parking Time
        // Difference In Hours
        int timeH = outHour - inHour;
        // Difference In Mintes
        int timeM = outMinutes - inMinutes;
        // Hours Parked
        int hoursParked = timeH;
        // Calculate Time Parked
        if (timeM < 0) {
            timeH--;
            timeM += 60;
        } else if (timeM > 0) {
            hoursParked++;
        }

        double total = 0.0;

        // Calculate Total
        switch(vehicleType) {
            case 'c':
            case 'C':
                printf("\nTYPE OF VEHICLE:        CAR\n");
                total = getTotal(hoursParked, 0, 3, 1.50);
                break;
            case 'T':
            case 't':
                printf("\nTYPE OF VEHICLE:        TRUCK\n");
                total = getTotal(hoursParked, 1, 2, 2.30);
                break;
            case 'B':
            case 'b':
                printf("\nTYPE OF VEHICLE:        BUS\n");
                total = getTotal(hoursParked, 2, 1, 3.70);
                break;
            default:
                printf("Invalid Vehicle Type.");
                return 1;
        }

        // Print Output
        printf("TIME-IN:                %02d:%02d\n", inHour, inMinutes);
        printf("TIME-OUT:               %02d:%02d\n", outHour, outMinutes);
        printf("PARKING TIME:           %02d:%02d\n", timeH, timeM);
        printf("ROUNDED TOTAL:          $%.2f\n\n", total);
    } else {
        // Parking Past-Midnight
        // Vehicle Will Be Towed Away
        printf("\nYou Have Parked Your Vehicle Past Mid-Night\n");
        printf("Your Vehicle is Towed Away :)\n\n");
    }
    return 0;
}