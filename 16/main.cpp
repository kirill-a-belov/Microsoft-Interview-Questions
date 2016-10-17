#include <iostream>


// Algorithm, complexity - O(100)
void putlong (unsigned long ul, int i = 0) {
    unsigned long offset;
    // Calculate the digit offset
    switch (i) {
        case 0:
            offset = 1000000000;
            break;
        case 1:
            offset = 100000000;
            break;
        case 2:
            offset = 10000000;
            break;
        case 3:
            offset = 1000000;
            break;
        case 4:
            offset = 100000;
            break;
        case 5:
            offset = 10000;
            break;
        case 6:
            offset = 1000;
            break;
        case 7:
            offset = 100;
            break;
        case 8:
            offset = 10;
            break;
        case 9:
            offset = 1;
            break;
    }
    for (int j = 0; j <= 9; ++j) {
        if ((ul - offset*j) < offset) {
            // Printing a proper number
            switch (j) {
                case 0:
                    putchar('0');
                    break;
                case 1:
                    putchar('1');
                    break;
                case 2:
                    putchar('2');
                    break;
                case 3:
                    putchar('3');
                    break;
                case 4:
                    putchar('4');
                    break;
                case 5:
                    putchar('5');
                    break;
                case 6:
                    putchar('6');
                    break;
                case 7:
                    putchar('7');
                    break;
                case 8:
                    putchar('8');
                    break;
                case 9:
                    putchar('9');
                    break;
            }
            // Reduce numeric digit and process new number
            ul -= offset*j;
            if (i < 9 ) putlong(ul,++i);
        }

    }
}

int main() {
    // Test ulong
    unsigned long ul = 4294967295;
    putlong(ul);

    return 0;
}