#!/bin/bash
git clone https://github.com/coderbyte-org/big-o
cd big-o
git switch -c feature-branch-2
touch __test__.txt
echo "test content" > __test__.txt
git status