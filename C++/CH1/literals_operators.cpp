#include <iostream>

int main() {

    std::cout << 5 << '\n';

    int x { 5 };
    std::cout << x << '\n';

    std::cout << 3 + 4 - 5 << '\n';

    int y { 2 };
    std::cout << (y = 5) << '\n';

    return 0;
}