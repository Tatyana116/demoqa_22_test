# test_latex

```math
\left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)

```math
\cos (2\theta) = \cos^2 \theta - \sin^2 \theta
```
```math
\lim\limits_{x \to \infty} \exp(-x) = 0
```

```math
a \bmod b
```
```math
x \equiv a \pmod{b}
```

```math
k_{n+1} = n^2 + k_n^2 - k_{n-1}
```

```math
x^{1.01}
```
```math
f(n) = n^5 + 4n^2 + 2 |_{n=17}
```
```math
\frac{n!}{k!(n-k)!} = \binom{n}{k}
```
```math
\frac{\frac{1}{x}+\frac{1}{y}}{y-z}
```
```math
^3/_7
```
```math
\begin{equation}
  x = a_0 + \cfrac{1}{a_1 
          + \cfrac{1}{a_2 
          + \cfrac{1}{a_3 + \cfrac{1}{a_4} } } }
\end{equation}
```
```math
\sqrt{\frac{a}{b}}
```
```math
\sqrt[n]{1+x+x^2+x^3+\dots+x^n}
```
```math
% New definition of square root:
% it renames \sqrt as \oldsqrt
\let\oldsqrt\sqrt
% it defines the new \sqrt in terms of the old one
\def\sqrt{\mathpalette\DHLhksqrt}
\def\DHLhksqrt#1#2{%
\setbox0=\hbox{$#1\oldsqrt{#2\,}$}\dimen0=\ht0
\advance\dimen0-0.2\ht0
\setbox2=\hbox{\vrule height\ht0 depth -\dimen0}%
{\box0\lower0.4pt\box2}}
```
```math
\sum_{i=1}^{10} t_i
```
```math
\displaystyle\sum_{i=1}^{10} t_i
```
```math
\sum_{\substack{
   0<i<m \\
   0<j<n
  }} 
 P(i,j)
```
