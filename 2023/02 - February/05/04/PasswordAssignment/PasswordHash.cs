using System.Security.Cryptography;

class PasswordHash {
    public string hashPW(string plainText) {
        MD5 md5 = System.Security.Cryptography.MD5.Create();
        byte[] inputBytes = System.Text.Encoding.ASCII.GetBytes(plainText);
        byte[] hashBytes = md5.ComputeHash(inputBytes);
        string upperHash = Convert.ToHexString(hashBytes);
        return upperHash.ToLower();
    }
}
