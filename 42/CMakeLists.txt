cmake_minimum_required(VERSION 3.5)
project(42)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp)
add_executable(42 ${SOURCE_FILES})