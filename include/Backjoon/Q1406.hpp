/* https://www.acmicpc.net/problem/1406 */

#include <iostream>
#include <string>
#include <stack>

std::stack<char> l_s;
std::stack<char> r_s;
std::string str;
char input;
char P_c;
int N;

void solution(const char& input, const char& P_c)
{
	if (input == 'L')
	{
		if (l_s.empty() == true)
			return;

		r_s.push(l_s.top());
		l_s.pop();
	}
	else if (input == 'D')
	{
		if (r_s.empty() == true)
			return;

		l_s.push(r_s.top());
		r_s.pop();
	}
	else if (input == 'B')
	{
		if (l_s.empty() == true)
			return;

		l_s.pop();
	}
	else if (input == 'P')
	{
		l_s.push(P_c);
	}
}

int main()
{
	std::cin >> str;
	for (const auto& str_it : str)
		l_s.push(str_it);
	std::cin >> N;
	std::cin.clear();
	for (int i = 0; i < N; i++)
	{
		std::cin >> input;
		if (input == 'P')
			std::cin >> P_c;
		solution(input, P_c);
	}

	while (l_s.empty() == false)
	{
		r_s.push(l_s.top());
		l_s.pop();
	}

	while (r_s.empty() == false)
	{
		std::cout << r_s.top();
		r_s.pop();
	}

}