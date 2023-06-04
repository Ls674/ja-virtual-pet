import discord #MTExNDcyMjM3MDY2NjYyNzEzMg.GlYMZ1.QeWvurQtAwOfZbwg1qJgUR-tplrET8VKc4CbyU
from discord.ext import commands
intents = discord.Intents().all()
Gilbert27 = commands.Bot(command_prefix=".",intents=intents)

@Gilbert27.command()
async def say(ctx,**message):
    ctx.reply(message)

Gilbert27.run("MTExNDcyMjM3MDY2NjYyNzEzMg.G-xQ8F.x-Ymsg7zJ9GYntwGXHfpeIyCu1rtapR1e5gA6w")