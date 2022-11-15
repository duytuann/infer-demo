// clang -c simple_null.cpp
// infer -- clang -c simple_null.cpp

void deref_null() {
    int* p = nullptr;
    *p = 42;
}