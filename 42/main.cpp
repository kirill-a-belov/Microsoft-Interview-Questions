#include <iostream>

unsigned int sBitSet(unsigned int i){
    int j = 0;
    unsigned int temp = i;
    while (temp >0){
        ++j;
        temp = temp>>1;
    }
    temp = 1;
    for (int k = j; k > 1; --k) {
        temp = temp <<1;
    }
    temp = i^temp;
    return temp;


}
int main() {
    unsigned int i = 1273975;
    std::cout << sBitSet(i);
}