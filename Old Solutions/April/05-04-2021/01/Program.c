#include <stdio.h>

int main() {
    const int k = 10;
    printf("%f", k * 2);
    scanf("%d", &k);
	printf("%d", k * 2);
    return 0;
}