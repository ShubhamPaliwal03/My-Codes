const user = {
    name: 'Hedy Lamarr',
    ImageUrl: 'https://i.imgur.com/yXOvdOSs.jpg',
    ImageSize: 90,
};

export default function Profile(){
    return (
        <>
            <h1>{user.name}</h1>
            <img
                className="avatar"
                src={user.ImageUrl}
                alt={'Photo of '+user.name}
                style={{
                    width: user.ImageSize,
                    height: user.ImageSize,
                }}
            />
        </>
    );
}