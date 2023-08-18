let str = String(prompt("Enter a word"));
let c = String(prompt("Enter letter"));

function count(s, c)
    {
        let res = 0;
 
        for (let i = 0; i < s.length; i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }


document.write(count(str, c));