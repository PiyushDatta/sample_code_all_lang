#include <iostream>

#ifndef TEMP_HEADER_GAURD
#define TEMP_HEADER_GAURD

void debug_log(const std::string &debug_string, const bool &debug_flag) {
  if (debug_flag) {
    std::printf(debug_string.c_str());
  }
}

class Sample {
public:
  /*
      multi-line comment
  */
  std::string hello_world = "hello_world";
  bool temp_bool = true;
  int temp_int = 3;
  void PrintSomething() {
    // some sample code
    std::cout << "Hello World!" << std::endl;
  }
};

int main() {
  Sample sample_class;
  std::cout << "Hello World!";
  return 0;
}
#endif