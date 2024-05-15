#include <iostream>
#include <stack>
#include <string>
using namespace std;
// Define the syntax tree node structure
struct Node {
string value;
Node* left;
Node* right;
// Constructor to initialize a node
Node(string val) : value(val), left(nullptr), right(nullptr) {}
};
// Function to perform arithmetic operations based on node value
int performOperation(string op, int operand1, int operand2) {
if (op == "+") return operand1 + operand2;
else if (op == "-") return operand1 - operand2;
else if (op == "*") return operand1 * operand2;
else if (op == "/") return operand1 / operand2;
else {
cerr << "Error: Invalid operator " << op << endl;
return 0;
}
}
// Function to traverse the syntax tree and perform actions
int evaluateSyntaxTree(Node* root) {
if (!root) return 0;
// If the node is a leaf node (operand), return its value
if (!root->left && !root->right) {
return stoi(root->value);
}
// Recursively evaluate left and right subtrees
int leftValue = evaluateSyntaxTree(root->left);
int rightValue = evaluateSyntaxTree(root->right);
// Perform the operation at the current node
return performOperation(root->value, leftValue, rightValue);
}
int main() {
// Example syntax tree:
// +
// / \
// * 5
// / \
// 2 3
Node* root = new Node("+");
root->left = new Node("*");
root->left->left = new Node("2");
root->left->right = new Node("3");
root->right = new Node("5");
// Evaluate the syntax tree
int result = evaluateSyntaxTree(root);
// Output the result
cout << "Result: " << result << endl;
// Clean up memory
delete root->left->left;
delete root->left->right;
delete root->left;
delete root->right;
delete root;
return 0;
}