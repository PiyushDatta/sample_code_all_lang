#include <stdbool.h>
#include <stdio.h>

struct point {
  int x;
  int y;
  const bool debug;
};

int main() {
  /*
      multi-line comment
  */
  struct point p = {2, 3, true};
  if (p.debug) {
    printf("%d \n", (p.x * p.y));
  }

  int i, j, rows;
  bool sample_bool = true;
  rows = p.x * p.y;
  printf("\n");

  // some sample code
  for (i = 1; i <= rows; ++i) {
    for (j = 1; j <= i; ++j) {
      if (sample_bool) {
        printf("* ");
      }
    }
    printf("\n");
  }

  return 0;
}