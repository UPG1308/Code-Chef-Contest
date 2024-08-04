#include <bits/stdc++.h>
using namespace std;
#define int long long
const int M = 1e9 + 7;

long long binpow(long long a, long long b, long long m = M)
{
    a %= m;
    long long res = 1;
    while (b > 0)
    {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res;
}

struct input_checker
{
    string buffer;
    int pos;

    const string all = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    const string number = "0123456789";
    const string upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const string lower = "abcdefghijklmnopqrstuvwxyz";

    input_checker()
    {
        pos = 0;
        while (true)
        {
            int c = cin.get();
            if (c == -1)
            {
                break;
            }
            buffer.push_back((char)c);
        }
    }

    int nextDelimiter()
    {
        int now = pos;
        while (now < (int)buffer.size() && !(buffer[now] == ' ' || buffer[now] == '\n'))
        {
            now++;
        }
        return now;
    }

    string readOne()
    {
        assert(pos < (int)buffer.size());
        int nxt = nextDelimiter();
        string res;
        while (pos < nxt)
        {
            res += buffer[pos];
            pos++;
        }
        return res;
    }

    string readString(int minl, int maxl, const string &pattern = "")
    {
        assert(minl <= maxl);
        string res = readOne();
        assert(minl <= (int)res.size());
        assert((int)res.size() <= maxl);
        for (int i = 0; i < (int)res.size(); i++)
        {
            assert(pattern.empty() || pattern.find(res[i]) != string::npos);
        }
        return res;
    }

    int readInt(int minv, int maxv)
    {
        assert(minv <= maxv);
        int res = stoi(readOne());
        assert(minv <= res);
        assert(res <= maxv);
        return res;
    }

    long long readLong(long long minv, long long maxv)
    {
        assert(minv <= maxv);
        long long res = stoll(readOne());
        assert(minv <= res);
        assert(res <= maxv);
        return res;
    }

    auto readInts(int n, int minv, int maxv)
    {
        assert(n >= 0);
        vector<int> v(n);
        for (int i = 0; i < n; ++i)
        {
            v[i] = readInt(minv, maxv);
            if (i + 1 < n)
                readSpace();
        }
        return v;
    }

    auto readLongs(int n, long long minv, long long maxv)
    {
        assert(n >= 0);
        vector<long long> v(n);
        for (int i = 0; i < n; ++i)
        {
            v[i] = readLong(minv, maxv);
            if (i + 1 < n)
                readSpace();
        }
        return v;
    }

    void readSpace()
    {
        assert((int)buffer.size() > pos);
        assert(buffer[pos] == ' ');
        pos++;
    }

    void readEoln()
    {
        assert((int)buffer.size() > pos);
        assert(buffer[pos] == '\n');
        pos++;
    }

    void readEof()
    {
        assert((int)buffer.size() == pos);
    }
} inp;

signed main()
{
    int t;
    // cin >> t;
    t = inp.readInt(1, 1000);
    inp.readEoln();
    int smn = 0;
    while (t--)
    {
        int n;
        // cin >> n;
        n = inp.readInt(1, 500'000);
        inp.readEoln();
        smn += n;
        int ans = 0;
        int tot = binpow(2, n);
        int inv = binpow(2, M - 2);
        int cur = inv;
        for (int i = 2; i <= n; i++)
        {
            int sq = ((i - 1) * (i - 1)) % M;
            int res = ((n - i + 1) * sq) % M;
            res *= cur;
            res %= M;
            cur *= inv;
            cur %= M;
            ans += res;
            ans %= M;
        }
        ans *= tot;
        ans %= M;
        ans += M;
        ans %= M;
        cout << ans << endl;
    }
    assert(smn <= 500000);
    inp.readEof();
    return 0;
}