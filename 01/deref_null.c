// infer run -- gcc -c deref_null.c

#include <stdlib.h>

int* allocate_int();
void set(int* p, int value);

void deref_null() {
    int* p = allocate_int();
    set(p, 42);
}