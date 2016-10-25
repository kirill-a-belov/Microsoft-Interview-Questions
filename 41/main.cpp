#include <iostream>

unsigned int bitReverse(unsigned int i){
    return (unsigned int)4294967295 - i ;
}

int main() {
    unsigned int i =  1;

    std::cout << bitReverse(1294967295);

}