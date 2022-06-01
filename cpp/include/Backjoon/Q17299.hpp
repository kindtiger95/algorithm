/* https://www.acmicpc.net/problem/17299 */

#include <iostream>
#include <stack>
#include <vector>

constexpr auto MAX_SIZE = 1000001;

std::vector<int> input(MAX_SIZE, 0);
std::vector<int> mem(MAX_SIZE, 0);
std::vector<int> a(MAX_SIZE, -1);
std::stack<int> s;

int N, M;

void solution()
{
	for (int i = 0; i < N; i++)
	{
		while (s.empty() == false && mem[input[i]] > mem[input[s.top()]] && input[i] != input[s.top()])
		{
			a[s.top()] = input[i];
			s.pop();
		}
		s.push(i);
	}
}

int main()
{
	std::cin >> N;
	for (int i = 0; i < N; i++)
	{
		std::cin >> M;
		input[i] = M;
		mem[M]++;
	}
	solution();
	for (int i = 0; i < N; i++)
	{
		std::cout << a[i] << " ";
	}
}